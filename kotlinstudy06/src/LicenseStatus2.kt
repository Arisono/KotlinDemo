sealed class LicenseStatus2 {
    //无状态
    object UnQualified : LicenseStatus2()
    object Learning : LicenseStatus2()
    //有状态
    class Qualified(val licenseId: String) : LicenseStatus2()
}

class Driver2(var status: LicenseStatus2) {

    fun checkLicense(): String {
        return when (status) {
            is LicenseStatus2.UnQualified -> "没资格"
            is LicenseStatus2.Learning -> "在学"
            is LicenseStatus2.Qualified -> "有资格，驾驶证编号：${(this.status as LicenseStatus2.Qualified).licenseId}"
        }
    }
}

fun main() {
    var status = LicenseStatus2.Qualified("2390323290")
    val driver = Driver2(status)
    println(driver.checkLicense())
}