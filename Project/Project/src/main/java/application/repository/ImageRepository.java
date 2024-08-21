package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Image;

public interface ImageRepository  extends JpaRepository<Image, Long> {

}
