package com.ormi.cookudasse.notice.infrastructure;

import com.ormi.cookudasse.notice.domain.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {
    List<Notice> findTop5ByOrderByCreatedAtDesc();
}
