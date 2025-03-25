package com.chatatune.whatsappclone.message;

import com.chatatune.whatsappclone.chat.Chat;
import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface MessageService {

    void saveMessage(MessageRequest messageRequest);

    List<MessageResponse> findChatMessages(String chatId);

    void setMessagesToSeen(String chatId, Authentication authentication);

    void uploadMediaMessage(String chatId, MultipartFile file, Authentication authentication);

    String getSenderId(Chat chat, Authentication authentication);

    String getRecipientId(Chat chat, Authentication authentication);
}
