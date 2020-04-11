package me.jfenn.attribouter.provider.net.github.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.jfenn.attribouter.provider.net.data.LicenseData

@Serializable
class GithubLicenseData : LicenseData() {
    @SerialName("key")
    override val key: String? = null

    @SerialName("name")
    override val name: String? = null

    @SerialName("description")
    override val description: String? = null

    @SerialName("body")
    override val body: String? = null

    @SerialName("html_url")
    override val infoUrl: String? = null

    @SerialName("permissions")
    override val permissions: Array<String>? = null

    @SerialName("conditions")
    override val conditions: Array<String>? = null

    @SerialName("limitations")
    override val limitations: Array<String>? = null
}