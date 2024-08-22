package com.apiexamples.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class PaginationResponse {

    private List<RegistrationDto> data ;
    private int pageNo;
    private int pageSize;
    private int totalPages;
    private boolean lastPage;
    private boolean firstPage;
}
