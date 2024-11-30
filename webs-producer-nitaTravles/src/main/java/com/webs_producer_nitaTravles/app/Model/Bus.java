package com.webs_producer_nitaTravles.app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bus
{
 
   @Id
   private int busid;
   private String fromLocation;
   private String toLocation;
}
