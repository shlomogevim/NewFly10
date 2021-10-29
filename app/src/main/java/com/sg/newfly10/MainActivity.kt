package com.sg.newfly10

import android.media.CamcorderProfile
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import com.google.ar.core.Anchor
import com.google.ar.sceneform.AnchorNode
import com.google.ar.sceneform.Node
import com.google.ar.sceneform.animation.ModelAnimator
import com.google.ar.sceneform.math.Quaternion
import com.google.ar.sceneform.math.Vector3
import com.google.ar.sceneform.rendering.Material
import com.google.ar.sceneform.rendering.ModelRenderable
import com.google.ar.sceneform.ux.ArFragment
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {

    lateinit var arFragment: ArFragment
    private val nodes = mutableListOf<RotatingNode>()
    private lateinit var videoRecorder: VideoRecorder
    private var isRecording=false


    private val model = Models.Flower                    // working fine
    private val modelResourceId = R.raw.flower
    val animationString="Scene"
    private var spaScale=false
    private var thisScale=0.075f


   /* private val model = Models.Caballallo                       // working fine
    private val modelResourceId = R.raw.caballomader
    val animationString="Armature|ArmatureAction.002"
    private var spaScale=false
    private var thisScale=0.03f*/

   /* private val model = Models.Shark                      // working fine
    private val modelResourceId = R.raw.shark
    val animationString="Armature|ArmatureAction"
    private var spaScale=false
    private var thisScale=0.8f*/


    /*private val model = Models.Fisherman              // working fine
    private val modelResourceId = R.raw.fishman
    val animationString="fishman"
    private var spaScale=false
*/

   /* private val model = Models.LoliRun                   // working fine
    private val modelResourceId = R.raw.loloi_run
    val animationString="CINEMA_4D___"*/


   /* private val model = Models.Nathan                    // working fine
    private val modelResourceId = R.raw.nathan*/

   /* private val model = Models.Sub                       //witoutcolor
    private val modelResourceId = R.raw.type_214
    val animationString="214_bone|214_boneAction"*/


    /*private val model = Models.Dragon                  // working fine
    private val modelResourceId = R.raw.dragon*/

   /* private val model = Models.Ship3
    private val modelResourceId = R.raw.ship3*/

    /*private val model = Models.Rumba2                 // // working fine
    private val modelResourceId = R.raw.rumba2*/

    private var curCameraPosition = Vector3.zero()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arFragment = fragment as ArFragment
        arFragment.setOnTapArPlaneListener { hitResult, _, _ ->
            loadModelAndAddToSence(hitResult.createAnchor(), modelResourceId)
        }

        videoRecorder = VideoRecorder(this).apply {
            sceneView = arFragment.arSceneView
            setVideoQuality(CamcorderProfile.QUALITY_1080P,resources.configuration.orientation)
        }
        setupFab()
    }

    private fun setupFab(){
        fab.setOnClickListener {

            fab.setOnLongClickListener {
                isRecording=videoRecorder.toggleRecordingState()
                true
            }
            fab.setOnTouchListener { view, motionEvent ->
                if (motionEvent.action== MotionEvent.ACTION_UP && isRecording){
                    isRecording=videoRecorder.toggleRecordingState()
                    Toast.makeText(this,"Save video to gallery ... ", Toast.LENGTH_LONG).show()
                    true
                }else false
            }



        }

    }

    private fun loadModelAndAddToSence(anchor: Anchor?, modelResourceId: Int) {
        ModelRenderable.builder()
            .setSource(this, modelResourceId)
            .build()
            .thenAccept { modelRenderable ->

                addNodeToScene(anchor, modelRenderable)

              //  modelRenderable.getMaterial().setFloat3("andyColor",0.92f,0.26f,0.21f)

                eliminateDot()
            }.exceptionally {
                Toast.makeText(this, "Error creatind nodes:$it", Toast.LENGTH_LONG).show()
                null
            }

    }



    private fun addNodeToScene(
        anchor: Anchor?,
        modelRenderable: ModelRenderable?
    ) {
        val anchorNode = AnchorNode(anchor)
        val rotatingNode = RotatingNode(model.degreesPerSecond).apply {

            setParent(anchorNode)
        }
        Node().apply {
            renderable = modelRenderable

            setParent(rotatingNode)
            localPosition = Vector3(model.radius, model.height, 0f)
            localRotation = Quaternion.eulerAngles(Vector3(0f, model.rotationDegrees, 0f))

        if (!spaScale){
            localScale = Vector3(thisScale, thisScale, thisScale)
        }

        }
        arFragment.arSceneView.scene.addChild(anchorNode)
        nodes.add(rotatingNode)
        //val animationData=modelRenderable?.getAnimationData("Beedrill_Animation")
        // val animationData=modelRenderable?.getAnimationData("mixamo.com")
       // val animationData = modelRenderable?.getAnimationData("Cinema_4D_Basis")
      //  val animationData = modelRenderable?.getAnimationData("CINEMA_4D_Main")
       // val animationData = modelRenderable?.getAnimationData("Dragon")
     // val animationData = modelRenderable?.getAnimationData("214_bone|214_boneAction")
        //val animationData = modelRenderable?.getAnimationData("rp_nathan_animated_003_walking")
      //  val animationData = modelRenderable?.getAnimationData("CINEMA_4D___")


       val animationData = modelRenderable?.getAnimationData(animationString)
        ModelAnimator(animationData, modelRenderable).apply {
            repeatCount = ModelAnimator.INFINITE
            start()
        }
    }

    private fun eliminateDot() {
        arFragment.arSceneView.planeRenderer.isVisible = false
        arFragment.planeDiscoveryController.hide()
        arFragment.planeDiscoveryController.setInstructionView(null)
    }
}