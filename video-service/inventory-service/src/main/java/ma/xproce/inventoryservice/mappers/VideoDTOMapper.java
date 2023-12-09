package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dtos.VideoDTO;
import ma.xproce.inventoryservice.entities.Video;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoDTOMapper{
    private final ModelMapper modelMapper;

    @Autowired
    public VideoDTOMapper(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public VideoDTO fromVideo(Video video){
        return modelMapper.map(video, VideoDTO.class);
    }

    public Video fromVideoDto(VideoDTO videoDTO){
        return modelMapper.map(videoDTO, Video.class);
    }
}