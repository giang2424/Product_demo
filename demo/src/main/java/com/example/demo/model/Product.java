
// package com.example.demo.model;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.SequenceGenerator;
// import jakarta.persistence.Table;


// @Entity

// @Table(name = "products")

// public class Product {

//     @Id
//     @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
//     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seuqence")
//     @Column(name = "id")
//     private Integer id;
//     @Column(name = "code")
//     private String code;
//     @Column(name = "name")
//     private String name;
//     @Column(name = "category")
//     private String category;
//     @Column(name = "brand")
//     private String brand;
//     @Column(name = "type")
//     private String type;
//     @Column(name = "description")
//     private String description;

//     // Getters and setters

//     public Integer getId() {
//         return id;
//     }

//     public void setId(Integer id) {
//         this.id = id;
//     }

//     public String getCode() {
//         return code;
//     }

//     public void setCode(String code) {
//         this.code = code;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getCategory() {
//         return category;
//     }

//     public void setCategory(String category) {
//         this.category = category;
//     }

//     public String getBrand() {
//         return brand;
//     }

//     public void setBrand(String brand) {
//         this.brand = brand;
//     }

//     public String getType() {
//         return type;
//     }

//     public void setType(String type) {
//         this.type = type;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }

//     public static Product build(
//             Integer id,
//             String code,
//             String name,
//             String category,
//             String brand,
//             String type,
//             String description) {
//         Product item = new Product();
//         item.id = id;
//         item.code = code;
//         item.name = name;
//         item.category = category;
//         item.brand = brand;
//         item.type = type;
//         item.description = description;
//         return item;
//     }

//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         int idx = -1;
//         if (id != null) {
//             sb.append(++idx > 0 ? ", " : "").append("id=").append(id);
//         }
//         if (code != null) {
//             sb.append(++idx > 0 ? ", " : "").append("code=").append(code);
//         }
//         if (name != null) {
//             sb.append(++idx > 0 ? ", " : "").append("name=").append(name);
//         }
//         if (category != null) {
//             sb.append(++idx > 0 ? ", " : "").append("category=").append(category);
//         }
//         if (brand != null) {
//             sb.append(++idx > 0 ? ", " : "").append("brand=").append(brand);
//         }
//         if (type != null) {
//             sb.append(++idx > 0 ? ", " : "").append("type=").append(type);
//         }
//         if (description != null) {
//             sb.append(++idx > 0 ? ", " : "").append("description=").append(description);
//         }
//         return sb.toString();
//     }
// }
package com.example.demo.model;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "brand")
    private String brand;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Product build(
            UUID id,
            String code,
            String name,
            String category,
            String brand,
            String type,
            String description) {
        Product item = new Product();
        item.id = id;
        item.code = code;
        item.name = name;
        item.category = category;
        item.brand = brand;
        item.type = type;
        item.description = description;
        return item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int idx = -1;
        if (id != null) {
            sb.append(++idx > 0 ? ", " : "").append("id=").append(id);
        }
        if (code != null) {
            sb.append(++idx > 0 ? ", " : "").append("code=").append(code);
        }
        if (name != null) {
            sb.append(++idx > 0 ? ", " : "").append("name=").append(name);
        }
        if (category != null) {
            sb.append(++idx > 0 ? ", " : "").append("category=").append(category);
        }
        if (brand != null) {
            sb.append(++idx > 0 ? ", " : "").append("brand=").append(brand);
        }
        if (type != null) {
            sb.append(++idx > 0 ? ", " : "").append("type=").append(type);
        }
        if (description != null) {
            sb.append(++idx > 0 ? ", " : "").append("description=").append(description);
        }
        return sb.toString();
    }
}
