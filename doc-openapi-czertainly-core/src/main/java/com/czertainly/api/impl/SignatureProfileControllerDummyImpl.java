package com.czertainly.api.impl;

import com.czertainly.api.exception.*;
import com.czertainly.api.interfaces.core.web.SignatureProfileController;
import com.czertainly.api.model.client.sign.SignatureProfileCreateRequestDto;
import com.czertainly.api.model.client.sign.SignatureProfileTsaDetailResponseDto;
import com.czertainly.api.model.client.sign.SignatureProfileUpdateRequestDto;
import com.czertainly.api.model.common.BulkActionMessageDto;
import com.czertainly.api.model.core.sign.SignatureProfileDto;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@SecurityRequirements(value = {
        @SecurityRequirement(name = "")
})
public class SignatureProfileControllerDummyImpl implements SignatureProfileController {
    @Override
    public List<SignatureProfileDto> listSignatureProfiles(Optional<Boolean> enabled) {
        return List.of();
    }

    @Override
    public SignatureProfileDto getSignatureProfile(UUID uuid) throws NotFoundException {
        return null;
    }

    @Override
    public SignatureProfileDto createSignatureProfile(@Valid SignatureProfileCreateRequestDto request) throws AlreadyExistException, AttributeException, NotFoundException, ValidationException {
        return null;
    }

    @Override
    public SignatureProfileDto updateSignatureProfile(UUID uuid, SignatureProfileUpdateRequestDto request) throws AttributeException, NotFoundException {
        return null;
    }

    @Override
    public void deleteSignatureProfile(UUID uuid) throws NotFoundException {

    }

    @Override
    public void disableSignatureProfile(UUID uuid) throws NotFoundException {

    }

    @Override
    public void enableSignatureProfile(UUID uuid) throws NotFoundException {

    }

    @Override
    public List<BulkActionMessageDto> bulkDeleteSignatureProfiles(List<UUID> uuids) throws NotFoundException, ValidationException {
        return List.of();
    }

    @Override
    public List<BulkActionMessageDto> bulkDisableSignatureProfiles(List<UUID> uuids) throws NotFoundException {
        return List.of();
    }

    @Override
    public List<BulkActionMessageDto> bulkEnableSignatureProfiles(List<UUID> uuids) throws NotFoundException {
        return List.of();
    }

    @Override
    public SignatureProfileTsaDetailResponseDto getTsaForSignatureProfile(UUID uuid) throws NotFoundException {
        return null;
    }

    @Override
    public SignatureProfileTsaDetailResponseDto activateTsaForSignatureProfile(UUID signatureProfileUuid, UUID tsaProfileUuid) throws ConnectorException, AttributeException, NotFoundException {
        return null;
    }

    @Override
    public void deactivateTsaForSignatureProfile(UUID uuid) throws NotFoundException {

    }
}
