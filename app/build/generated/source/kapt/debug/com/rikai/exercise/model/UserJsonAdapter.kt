// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.rikai.exercise.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class UserJsonAdapter(
  moshi: Moshi
) : JsonAdapter<User>() {
  private val options: JsonReader.Options = JsonReader.Options.of("avatar_url", "login",
      "site_admin")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "avatar_url")

  private val booleanAdapter: JsonAdapter<Boolean> = moshi.adapter(Boolean::class.java, emptySet(),
      "site_admin")

  public override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("User").append(')') }

  public override fun fromJson(reader: JsonReader): User {
    var avatar_url: String? = null
    var login: String? = null
    var site_admin: Boolean? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> avatar_url = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("avatar_url",
            "avatar_url", reader)
        1 -> login = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("login", "login",
            reader)
        2 -> site_admin = booleanAdapter.fromJson(reader) ?: throw Util.unexpectedNull("site_admin",
            "site_admin", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return User(
        avatar_url = avatar_url ?: throw Util.missingProperty("avatar_url", "avatar_url", reader),
        login = login ?: throw Util.missingProperty("login", "login", reader),
        site_admin = site_admin ?: throw Util.missingProperty("site_admin", "site_admin", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: User?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("avatar_url")
    stringAdapter.toJson(writer, value_.avatar_url)
    writer.name("login")
    stringAdapter.toJson(writer, value_.login)
    writer.name("site_admin")
    booleanAdapter.toJson(writer, value_.site_admin)
    writer.endObject()
  }
}
