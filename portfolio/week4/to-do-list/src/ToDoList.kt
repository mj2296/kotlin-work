// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count { it.status == ItemStatus.NotStarted }   // compute no. of items with NotStarted status
    val inProgress get() = items.count { it.status == ItemStatus.InProgress }  // compute no. of items with InProgress status
    val done get() = items.count { it.status == ItemStatus.Done }         // compute no. of items with Done status
    val overdue get() = items.count { it.isOverdue() }    // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the formats

        Path(filename).forEachLine { line ->
            val parts = line.split(": ", limit = 3)
            val date = LocalDate.parse(parts[0])
            val status = ItemStatus.valueOf(parts[1])
            val description = parts[2]
            
            items.add(ToDoItem(date, status, description))
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        return items.removeAll { it.status == ItemStatus.Done }
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        return if (status == null) items.toList() else items.filter { it.status == status}
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        return items.filter { it.dueDate == date }
    }
}
