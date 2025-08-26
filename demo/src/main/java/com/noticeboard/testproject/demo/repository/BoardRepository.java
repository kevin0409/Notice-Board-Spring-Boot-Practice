package com.noticeboard.testproject.demo.repository;

import com.noticeboard.testproject.demo.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    // UPDATE board_table set boartd_hits=board_hits+1 where id=?
    //delete시에는 @Modifying
    @Modifying
    @Query(value =  "update BoardEntity b set b.boardHits=b.boardHits+1 where b.id=:id")
    void updateHits(@Param("id") Long id);

}
