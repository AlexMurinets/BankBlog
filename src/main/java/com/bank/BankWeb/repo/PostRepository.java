package com.bank.BankWeb.repo;

import com.bank.BankWeb.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
