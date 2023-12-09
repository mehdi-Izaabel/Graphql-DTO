package ma.xproce.inventoryservice;

import ch.qos.logback.core.model.Model;
import ma.xproce.inventoryservice.dtos.CreatorDTO;
import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.entities.Video;
import ma.xproce.inventoryservice.mappers.CreatorDTOMapper;
import ma.xproce.inventoryservice.mappers.ModelMapperConfig;
import ma.xproce.inventoryservice.mappers.VideoDTOMapper;
import ma.xproce.inventoryservice.repositories.CreatorRepository;
import ma.xproce.inventoryservice.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class InventoryServiceApplication {

    @Autowired
  private ModelMapperConfig creatorMapper ;

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {
        /* //   List<Creator> creators = List.of(Creator.builder().name("x").email("x@gmail.com").build(), Creator.builder().name("y").email("y@gmail.com").build(), Creator.builder().name("z").email("z@gmail.com").build());

            CreatorDTO creator1 =  CreatorDTO.builder().name("mehdi").build();
            CreatorDTO creator2 = CreatorDTO.builder().name("zay").build();
            CreatorDTO creator3 =  CreatorDTO.builder().name("zaymehdi").build();

            List<CreatorDTO> creatorsdtolist = List.of(creator1,creator2,creator3);


            List<Creator> creators = creatorsdtolist.stream().map(CreatorDTOMapper::fromCreatorDTO).collect(Collectors.toList());;

            for (Creator creator : creators) {
                creatorRepository.save(creator);
            }

            List<Video> videos = List.of(Video.builder().name("vEducation").url("vEducation.com").datePublication(new Date()).description("this is an educational video").creator(creators.get(1)).build(), Video.builder().name("vGaming").url("vEGaming.com").datePublication(new Date()).description("this is a Gaming video").creator(creators.get(0)).build(), Video.builder().name("vEntertainement").url("vEntertainement.com").datePublication(new Date()).description("this is an entertainement video").creator(creators.get(2)).build());
            for (Video video : videos) {
                videoRepository.save(video);
            }
       */ };
    }
}
