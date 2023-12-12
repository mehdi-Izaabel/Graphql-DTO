package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dtos.CreatorDTO;
import ma.xproce.inventoryservice.dtos.VideoDTO;
import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.entities.Video;
import ma.xproce.inventoryservice.mappers.CreatorDTOMapper;
import ma.xproce.inventoryservice.mappers.VideoDTOMapper;
import ma.xproce.inventoryservice.repositories.CreatorRepository;
import ma.xproce.inventoryservice.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoGraphQlController {
    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;
    private CreatorDTOMapper creatorDTOMapper;
    private VideoDTOMapper videoDTOMapper;
    @Autowired
    VideoGraphQlController(CreatorRepository creatorRepository, VideoRepository videoRepository, CreatorDTOMapper creatorDTOMapper, VideoDTOMapper videoDTOMapper) {
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
        this.creatorDTOMapper = creatorDTOMapper;
        this.videoDTOMapper = videoDTOMapper;
    }

    @QueryMapping
    public List<Video> videotList() {
        return videoRepository.findAll();
    }

    @QueryMapping
    public Creator creatorById(@Argument Long id) {
        return creatorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Creator %s not found", id)));
    }
/*
    @MutationMapping
    public Video saveVideo(@Argument Video video) {
        creatorRepository.save(video.getCreator());
        return videoRepository.save(video);
    }

    @MutationMapping
    public Creator saveCreator(@Argument Creator creator) {
        return creatorRepository.save(creator);
    }
    */
@MutationMapping
public Video saveVideo(@Argument VideoDTO videoDTO) {
    Video video = videoDTOMapper.fromVideoDto(videoDTO);
    return videoRepository.save(video);
}
    @MutationMapping
    public CreatorDTO saveCreator(@Argument CreatorDTO creatorDTO){
        Creator creator = creatorDTOMapper.fromCreatorDto(creatorDTO);

        Creator savedCreator = creatorRepository.save(creator);

        return creatorDTOMapper.fromCreator(savedCreator);
    }
}