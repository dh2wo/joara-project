package com.joara.reply.usecase;

import com.joara.reply.usecase.dto.ReplyCommandDto.ReplyCreateRequestDto;
import com.joara.reply.usecase.dto.ReplyCommandDto.ReplyDeleteResponseDto;
import com.joara.reply.usecase.dto.ReplyCommandDto.ReplyUpdateResponseDto;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public interface ReplyDeleteUsecase {

    ReplyDeleteResponseDto delete(Long bid, UUID eid, UUID cid, UUID rid, ReplyCreateRequestDto dto, HttpServletRequest request);
}
