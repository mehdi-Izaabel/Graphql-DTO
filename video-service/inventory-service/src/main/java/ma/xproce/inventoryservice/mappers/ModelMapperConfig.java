package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dtos.CreatorDTO;
import ma.xproce.inventoryservice.dtos.VideoDTO;
import ma.xproce.inventoryservice.dtos.CreatorDTO;
import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.entities.Video;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
