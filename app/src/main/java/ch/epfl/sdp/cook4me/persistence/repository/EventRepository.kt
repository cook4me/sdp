package ch.epfl.sdp.cook4me.persistence.repository

import ch.epfl.sdp.cook4me.ui.eventform.Event
import com.google.firebase.firestore.FirebaseFirestore

private const val COLLECTION_PATH = "events"

class EventRepository(private val store: FirebaseFirestore = FirebaseFirestore.getInstance()) : ObjectRepository() {

    suspend fun add(event: Event) =
        store.addObjectToCollection(event, COLLECTION_PATH)
}
