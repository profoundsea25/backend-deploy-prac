package com.udangtangtang.backend.domain;


import com.udangtangtang.backend.dto.LocationRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Location extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String placeName;

    @Column(nullable = false)
    private String roadAddressName;

    @Column(nullable = false)
    private String xCoordinate;

    @Column(nullable = false)
    private String yCoordinate;

    @Column(nullable = false)
    private String categoryName;

    @Column(nullable = false)
    private Long userId;

    public Location(LocationRequestDto requestDto, Long userId) {
        this.placeName = requestDto.getPlaceName();
        this.roadAddressName = requestDto.getRoadAddressName();
        this.xCoordinate = requestDto.getXCoordinate();
        this.yCoordinate = requestDto.getYCoordinate();
        this.categoryName = requestDto.getCategoryName();
        this.userId = userId;
    }
}
