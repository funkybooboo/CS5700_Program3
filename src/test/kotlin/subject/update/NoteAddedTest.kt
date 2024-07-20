package subject.update

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNull
import kotlin.test.Test
import kotlin.test.assertNotNull

class NoteAddedTest {
    @Test
    fun testConstruction() {
        val type = "noteadded"
        val shipmentId = "123"
        val timeStamp = System.currentTimeMillis()
        val noteInfo = "Important note"

        val update = NoteAdded(type, shipmentId, timeStamp, noteInfo)
        assertNotNull(update)
    }

    @Test
    fun testCanGetAttributes() {
        val type = "noteadded"
        val shipmentId = "123"
        val timeStamp = System.currentTimeMillis()
        val noteInfo = "Important note"

        val update = NoteAdded(type, shipmentId, timeStamp, noteInfo)

        assertEquals(type, update.type)
        assertEquals(shipmentId, update.shipmentId)
        assertEquals(timeStamp, update.timestampOfUpdate)
        assertEquals(noteInfo, update.otherInfo)
    }

    @Test
    fun testGetLocation() {
        val type = "noteadded"
        val shipmentId = "123"
        val timeStamp = System.currentTimeMillis()
        val noteInfo = "Important note"

        val update = NoteAdded(type, shipmentId, timeStamp, noteInfo)

        val location = update.getLocation()

        assertNull(location)
    }

    @Test
    fun testGetNote() {
        val type = "noteadded"
        val shipmentId = "123"
        val timeStamp = System.currentTimeMillis()
        val noteInfo = "Important note"

        val update = NoteAdded(type, shipmentId, timeStamp, noteInfo)

        val note = update.getNote()

        assertEquals(noteInfo, note)
    }

    @Test
    fun testGetExpectedDeliveryDateTimestamp() {
        val type = "noteadded"
        val shipmentId = "123"
        val timeStamp = System.currentTimeMillis()
        val noteInfo = "Important note"

        val update = NoteAdded(type, shipmentId, timeStamp, noteInfo)

        val timestamp = update.getExpectedDeliveryDateTimestamp()

        assertNull(timestamp)
    }
}