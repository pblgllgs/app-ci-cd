package com.pblgllgs.model;
/*
 *
 * @author pblgl
 * Created on 17-11-2023
 *
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {

    private String id;
    private String content;
}