-if class com.rikai.exercise.model.UserProfile
-keepnames class com.rikai.exercise.model.UserProfile
-if class com.rikai.exercise.model.UserProfile
-keep class com.rikai.exercise.model.UserProfileJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
