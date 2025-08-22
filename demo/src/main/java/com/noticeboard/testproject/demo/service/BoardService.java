package com.noticeboard.testproject.demo.service;


import com.noticeboard.testproject.demo.dto.BoardDTO;
import com.noticeboard.testproject.demo.entity.BoardEntity;
import com.noticeboard.testproject.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


// DTO -> Entity
// Entity -> DTO


@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
