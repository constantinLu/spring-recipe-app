package gizet.springframework.services.contract;

import org.springframework.web.multipart.MultipartFile;


public interface ImageService {

   void saveImageFile(Long recipeId, MultipartFile file);

}
