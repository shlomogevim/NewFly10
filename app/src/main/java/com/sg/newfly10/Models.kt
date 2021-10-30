package com.sg.newfly10

sealed class Models {

    abstract val degreesPerSecond: Float
    abstract val radius: Float
    abstract val height: Float
    abstract val rotationDegrees: Float

    object Fish: Models() {
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 3.5f
        override val height: Float
            get() = 0.1f
        override val rotationDegrees: Float
            get() = 180f
    }


    object Fly: Models() {                           //model-11
        override val degreesPerSecond: Float
            get() = 3f
        override val radius: Float
            get() = 5.5f
        override val height: Float
            get() = 0.02f
        override val rotationDegrees: Float
            get() = 90f
    }

    object Flower: Models() {
        override val degreesPerSecond: Float
            get() = 20f
        override val radius: Float
            get() = 0.001f
        override val height: Float
            get() = 0.02f
        override val rotationDegrees: Float
            get() = 90f
    }

    object Caballallo: Models() {
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.2f
        override val height: Float
            get() = 0.2f
        override val rotationDegrees: Float
            get() = 90f
    }

    object Shark: Models() {
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.08f
        override val height: Float
            get() = 0.2f
        override val rotationDegrees: Float
            get() = 180f
    }

    object Fisherman : Models() {
        override val degreesPerSecond: Float
            get() = 5f
        override val radius: Float
            get() = 0.001f
        override val height: Float
            get() = 0.01f
        override val rotationDegrees: Float
            get() = 180f
    }

    object LoliRun : Models() {
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.1f
        override val height: Float
            get() = 0.1f
        override val rotationDegrees: Float
            get() = 180f
    }

    object Nathan : Models() {
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.2f
        override val height: Float
            get() = -0.1f
        override val rotationDegrees: Float
            get() = 180f
    }

    object Submarine : Models() {
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.6f
        override val height: Float
            get() = -0.1f
        override val rotationDegrees: Float
            get() = 360f
    }

   object Dragon : Models() {
         override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.2f
        override val height: Float
            get() = -0.1f
        override val rotationDegrees: Float
            get() = 180f
    }


    object Ship3 : Models() {
        override val degreesPerSecond: Float
            get() = 5f
        override val radius: Float
            get() = 8f
        override val height: Float
            get() = 0.3f
        override val rotationDegrees: Float
            get() = 90f
    }


    object Rumba2 : Models() {
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.03f
        override val height: Float
            get() = 0.0f
        override val rotationDegrees: Float
            get() = 180f
    }




}
