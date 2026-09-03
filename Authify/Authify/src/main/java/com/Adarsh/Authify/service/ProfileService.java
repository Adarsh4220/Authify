package com.Adarsh.Authify.service;

import com.Adarsh.Authify.io.ProfileRequest;
import com.Adarsh.Authify.io.ProfileResponse;

public interface ProfileService {
    ProfileResponse createProfile(ProfileRequest request);
}
