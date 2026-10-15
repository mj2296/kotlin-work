// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(document: String, text: String, character: Char = 'X'): String {
    return document.replace(text, character.toString().repeat(text.length))
}
