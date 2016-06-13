LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := AndroidJni
LOCAL_SRC_FILES := AndroidJni.cpp

include $(BUILD_SHARED_LIBRARY)
