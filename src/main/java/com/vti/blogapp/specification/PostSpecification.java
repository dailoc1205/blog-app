package com.vti.blogapp.specification;

import com.vti.blogapp.entity.Post;
import com.vti.blogapp.form.PostFilterPorm;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class PostSpecification {
    public  static Specification<Post> buildSpec(PostFilterPorm form){
        return (root, query, builder) -> {
          var perdicates = new ArrayList<Predicate>();
          var search = form.getSearch();
          if (StringUtils.hasText(search)){
              var pattern = "%" +search.trim() + "%";
              var predicate = builder.like(root.get("title"), pattern);
              perdicates.add(predicate);
          }

            var minCreatedDate = form.getMinCreatedDate();
          if (minCreatedDate != null){
              var minCreatedAt = LocalDateTime.of(minCreatedDate, LocalTime.MIN);
              var predicate = builder.greaterThanOrEqualTo(root.get("createdAt"), minCreatedAt);
              perdicates.add(predicate);
          }

            var maxCreatedDate = form.getMaxCreatedDate();
          if (maxCreatedDate != null){
              var maxCreatedAt = LocalDateTime.of(maxCreatedDate, LocalTime.MAX);
              var predicate = builder.greaterThanOrEqualTo(root.get("createdAt"), maxCreatedAt);
              perdicates.add(predicate);
          }
            return builder.and(perdicates.toArray(new Predicate[0]));
        };
    }
}
