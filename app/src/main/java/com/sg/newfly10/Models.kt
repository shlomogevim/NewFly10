package com.sg.newfly10

sealed class Models {

    abstract val degreesPerSecond: Float
    abstract val radius: Float
    abstract val height: Float
    abstract val rotationDegrees: Float

    object Submarine : Models() {                   //model-1
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.6f
        override val height: Float
            get() = -0.1f
        override val rotationDegrees: Float
            get() = 360f
    }

    object Rumba2 : Models() {                         //model-2
        override val degreesPerSecond: Float
            get() = 20f
        override val radius: Float
            get() = 0.03f
        override val height: Float
            get() = 0.0f
        override val rotationDegrees: Float
            get() = 180f
    }

    object Ship3 : Models() {                          //model-3
        override val degreesPerSecond: Float
            get() = 5f
        override val radius: Float
            get() = 1f
        override val height: Float
            get() = -0.8f
        override val rotationDegrees: Float
            get() = 90f
    }

    object Dragon : Models() {                         //model-4
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.2f
        override val height: Float
            get() = -0.1f
        override val rotationDegrees: Float
            get() = 180f
    }

    object Nathan : Models() {                           // model-5
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.2f
        override val height: Float
            get() = -0.1f
        override val rotationDegrees: Float
            get() = 180f
    }

    object LoliRun : Models() {                            // model-6
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.1f
        override val height: Float
            get() = 0.1f
        override val rotationDegrees: Float
            get() = 180f
    }

    object Fisherman : Models() {                   //  model-7
        override val degreesPerSecond: Float
            get() = 5f
        override val radius: Float
            get() = 0.001f
        override val height: Float
            get() = 0.01f
        override val rotationDegrees: Float
            get() = 90f                         // can not change direction
    }

    object Shark: Models() {                      // model-8
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 0.08f
        override val height: Float
            get() = 0.2f
        override val rotationDegrees: Float
            get() = 180f
    }

    object Caballallo: Models() {
        override val degreesPerSecond: Float           // model-9
            get() = 10f
        override val radius: Float
            get() = 0.2f
        override val height: Float
            get() = 0.2f
        override val rotationDegrees: Float
            get() = 90f
    }

    object Flower: Models() {                    // model-10
        override val degreesPerSecond: Float
            get() = 20f
        override val radius: Float
            get() = 0.001f
        override val height: Float
            get() = 0.02f
        override val rotationDegrees: Float
            get() = 90f
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


    object Fish: Models() {                        //model-20
        override val degreesPerSecond: Float
            get() = 10f
        override val radius: Float
            get() = 3.5f
        override val height: Float
            get() = 0.1f
        override val rotationDegrees: Float
            get() = 180f
    }































}
