package ma.xproce.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor


@Builder
@Entity
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name, url, description;
    public Date datePublication;
    @ManyToOne
    private Creator creator;
}
