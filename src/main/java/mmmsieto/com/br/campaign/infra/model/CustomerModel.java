package mmmsieto.com.br.campaign.infra.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customer")
public class CustomerModel {

    @Id
    private ObjectId id;

    @Field(name = "name")
    private String name;

    @Field(name = "email")
    private String email;

    @Field(name = "birthDate")
    private String birthDate;

}
