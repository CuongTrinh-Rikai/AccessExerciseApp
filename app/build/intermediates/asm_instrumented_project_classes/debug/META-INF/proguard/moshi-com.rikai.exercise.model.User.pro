-if class com.rikai.exercise.model.User
-keepnames class com.rikai.exercise.model.User
-if class com.rikai.exercise.model.User
-keep class com.rikai.exercise.model.UserJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
