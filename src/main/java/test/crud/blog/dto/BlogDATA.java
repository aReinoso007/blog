package test.crud.blog.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;

public interface BlogDATA{

    Long getUid();
    String getContenido();
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "America/Guayaquil")
    Timestamp getCreatedAt();
    String getStatus();
    String getTitle();
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "America/Guayaquil")
    Timestamp getUpdatedAt();
    Long getUserUID();
    String getAuthor();

}
