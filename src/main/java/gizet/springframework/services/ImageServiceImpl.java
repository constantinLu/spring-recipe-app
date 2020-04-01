package gizet.springframework.services;

import gizet.springframework.domain.Recipe;
import gizet.springframework.repositories.RecipeRepository;
import gizet.springframework.services.contract.ImageService;
import gizet.springframework.services.contract.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Service
@Slf4j
public class ImageServiceImpl implements ImageService {

    RecipeRepository recipeRepository;

    public ImageServiceImpl(RecipeRepository recipeService) {
        this.recipeRepository = recipeService;
    }

    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {

        Recipe recipe = recipeRepository.findById(recipeId).get();

        try {
            Byte[] byteObject = new Byte[file.getBytes().length];

            int i = 0;

            for (byte b : file.getBytes()) {
                byteObject[i++] = b;
            }

            recipe.setImage(byteObject);

            recipeRepository.save(recipe);

        } catch (IOException e) {
            //TODO handler here
            log.error("Error occured", e);
            e.printStackTrace();
        }


    }
}
