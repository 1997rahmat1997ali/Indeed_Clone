package com.ali.server.dao;

import com.ali.server.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface PostDao extends JpaRepository<PostModel, Integer> {
}
