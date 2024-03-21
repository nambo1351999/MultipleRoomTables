package com.phanphuongnam.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.phanphuongnam.multipleroomtables.entities.Director
import com.phanphuongnam.multipleroomtables.entities.School

data class SchoolAndDirector(
    @Embedded val schoolName: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director

)
