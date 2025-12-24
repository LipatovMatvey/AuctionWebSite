package ru.AuctionWebSite.Backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.AuctionWebSite.Backend.Entity.News;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findAllByOrderByIdDesc();

    News findByTitle(String title);
    News findByContent(String title);
}