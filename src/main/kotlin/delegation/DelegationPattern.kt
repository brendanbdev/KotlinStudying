package delegation

//---------------------------------------------------------------------------------------------------
//  DELEGATION PATTERN - Kotlin supports easy implementation of the delegation pattern on the native
//  level without any boilerplate code. (This is my demonstration from ChatGPT)

interface Logger {
    fun log(message: String)
}

class FileLogger(private val fileName: String) : Logger {
    override fun log(message: String) {
        // Implementation to log to a file
        println("Logging to file '$fileName': $message")
    }
}

class ConsoleLogger : Logger {
    override fun log(message: String) {
        // Implementation to log to the console
        println("Logging to console: $message")
    }
}

class MultiLogger(
    private val fileLogger: Logger,
    private val consoleLogger: Logger
) : Logger by fileLogger {

    // Additional functionality or customization can be added here

    fun logToFileAndConsole(message: String) {
        // Additional logic
        fileLogger.log(message)
        consoleLogger.log(message)
    }
}

fun main() {
    val fileLogger = FileLogger("app.log")
    val consoleLogger = ConsoleLogger()

    // Using MultiLogger for combined logging
    val multiLogger = MultiLogger(fileLogger, consoleLogger)
    multiLogger.log("Delegation Example")
    multiLogger.logToFileAndConsole("Combined Logging Example")
}