    package ma.xproce.inventoryservice.mappers;

    import ma.xproce.inventoryservice.dtos.CreatorDTO;
    import ma.xproce.inventoryservice.entities.Creator;
    import org.modelmapper.ModelMapper;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    @Service
    public class CreatorDTOMapper{
        private final ModelMapper modelMapper;

        @Autowired
        public CreatorDTOMapper(ModelMapper modelMapper){
            this.modelMapper = modelMapper;
        }

        public CreatorDTO fromCreator(Creator creator){
            return modelMapper.map(creator, CreatorDTO.class);
        }

        public Creator fromCreatorDto(CreatorDTO creatorDTO){
            return modelMapper.map(creatorDTO, Creator.class);
        }
    }