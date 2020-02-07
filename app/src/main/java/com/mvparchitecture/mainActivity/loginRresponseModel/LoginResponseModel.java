package com.mvparchitecture.mainActivity.loginRresponseModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponseModel {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public class Datum {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("first_name")
        @Expose
        private String firstName;
        @SerializedName("last_name")
        @Expose
        private String lastName;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("token")
        @Expose
        private String token;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("dob")
        @Expose
        private String dob;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("address_latitude")
        @Expose
        private String addressLatitude;
        @SerializedName("address_logitude")
        @Expose
        private String addressLogitude;
        @SerializedName("citizenship")
        @Expose
        private String citizenship;
        @SerializedName("employment")
        @Expose
        private String employment;
        @SerializedName("income_level")
        @Expose
        private String incomeLevel;
        @SerializedName("best_food_cuisines")
        @Expose
        private String bestFoodCuisines;
        @SerializedName("best_service")
        @Expose
        private String bestService;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("date_joining")
        @Expose
        private String dateJoining;
        @SerializedName("otp")
        @Expose
        private String otp;
        @SerializedName("profile_image")
        @Expose
        private String profileImage;
        @SerializedName("referance_earning")
        @Expose
        private String referanceEarning;
        @SerializedName("referance_code")
        @Expose
        private String referanceCode;
        @SerializedName("last_view_items")
        @Expose
        private String lastViewItems;
        @SerializedName("login_type")
        @Expose
        private String loginType;
        @SerializedName("user_type")
        @Expose
        private String userType;
        @SerializedName("device_token")
        @Expose
        private String deviceToken;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAddressLatitude() {
            return addressLatitude;
        }

        public void setAddressLatitude(String addressLatitude) {
            this.addressLatitude = addressLatitude;
        }

        public String getAddressLogitude() {
            return addressLogitude;
        }

        public void setAddressLogitude(String addressLogitude) {
            this.addressLogitude = addressLogitude;
        }

        public String getCitizenship() {
            return citizenship;
        }

        public void setCitizenship(String citizenship) {
            this.citizenship = citizenship;
        }

        public String getEmployment() {
            return employment;
        }

        public void setEmployment(String employment) {
            this.employment = employment;
        }

        public String getIncomeLevel() {
            return incomeLevel;
        }

        public void setIncomeLevel(String incomeLevel) {
            this.incomeLevel = incomeLevel;
        }

        public String getBestFoodCuisines() {
            return bestFoodCuisines;
        }

        public void setBestFoodCuisines(String bestFoodCuisines) {
            this.bestFoodCuisines = bestFoodCuisines;
        }

        public String getBestService() {
            return bestService;
        }

        public void setBestService(String bestService) {
            this.bestService = bestService;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDateJoining() {
            return dateJoining;
        }

        public void setDateJoining(String dateJoining) {
            this.dateJoining = dateJoining;
        }

        public String getOtp() {
            return otp;
        }

        public void setOtp(String otp) {
            this.otp = otp;
        }

        public String getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(String profileImage) {
            this.profileImage = profileImage;
        }

        public String getReferanceEarning() {
            return referanceEarning;
        }

        public void setReferanceEarning(String referanceEarning) {
            this.referanceEarning = referanceEarning;
        }

        public String getReferanceCode() {
            return referanceCode;
        }

        public void setReferanceCode(String referanceCode) {
            this.referanceCode = referanceCode;
        }

        public String getLastViewItems() {
            return lastViewItems;
        }

        public void setLastViewItems(String lastViewItems) {
            this.lastViewItems = lastViewItems;
        }

        public String getLoginType() {
            return loginType;
        }

        public void setLoginType(String loginType) {
            this.loginType = loginType;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public String getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }
}
