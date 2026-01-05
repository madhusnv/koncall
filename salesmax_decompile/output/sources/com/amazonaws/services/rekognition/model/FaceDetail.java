package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class FaceDetail implements Serializable {
    private AgeRange ageRange;
    private Beard beard;
    private BoundingBox boundingBox;
    private Float confidence;
    private List<Emotion> emotions;
    private EyeDirection eyeDirection;
    private Eyeglasses eyeglasses;
    private EyeOpen eyesOpen;
    private FaceOccluded faceOccluded;
    private Gender gender;
    private List<Landmark> landmarks;
    private MouthOpen mouthOpen;
    private Mustache mustache;
    private Pose pose;
    private ImageQuality quality;
    private Smile smile;
    private Sunglasses sunglasses;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FaceDetail)) {
            return false;
        }
        FaceDetail faceDetail = (FaceDetail) obj;
        if ((faceDetail.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (faceDetail.getBoundingBox() != null && !faceDetail.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((faceDetail.getAgeRange() == null) ^ (getAgeRange() == null)) {
            return false;
        }
        if (faceDetail.getAgeRange() != null && !faceDetail.getAgeRange().equals(getAgeRange())) {
            return false;
        }
        if ((faceDetail.getSmile() == null) ^ (getSmile() == null)) {
            return false;
        }
        if (faceDetail.getSmile() != null && !faceDetail.getSmile().equals(getSmile())) {
            return false;
        }
        if ((faceDetail.getEyeglasses() == null) ^ (getEyeglasses() == null)) {
            return false;
        }
        if (faceDetail.getEyeglasses() != null && !faceDetail.getEyeglasses().equals(getEyeglasses())) {
            return false;
        }
        if ((faceDetail.getSunglasses() == null) ^ (getSunglasses() == null)) {
            return false;
        }
        if (faceDetail.getSunglasses() != null && !faceDetail.getSunglasses().equals(getSunglasses())) {
            return false;
        }
        if ((faceDetail.getGender() == null) ^ (getGender() == null)) {
            return false;
        }
        if (faceDetail.getGender() != null && !faceDetail.getGender().equals(getGender())) {
            return false;
        }
        if ((faceDetail.getBeard() == null) ^ (getBeard() == null)) {
            return false;
        }
        if (faceDetail.getBeard() != null && !faceDetail.getBeard().equals(getBeard())) {
            return false;
        }
        if ((faceDetail.getMustache() == null) ^ (getMustache() == null)) {
            return false;
        }
        if (faceDetail.getMustache() != null && !faceDetail.getMustache().equals(getMustache())) {
            return false;
        }
        if ((faceDetail.getEyesOpen() == null) ^ (getEyesOpen() == null)) {
            return false;
        }
        if (faceDetail.getEyesOpen() != null && !faceDetail.getEyesOpen().equals(getEyesOpen())) {
            return false;
        }
        if ((faceDetail.getMouthOpen() == null) ^ (getMouthOpen() == null)) {
            return false;
        }
        if (faceDetail.getMouthOpen() != null && !faceDetail.getMouthOpen().equals(getMouthOpen())) {
            return false;
        }
        if ((faceDetail.getEmotions() == null) ^ (getEmotions() == null)) {
            return false;
        }
        if (faceDetail.getEmotions() != null && !faceDetail.getEmotions().equals(getEmotions())) {
            return false;
        }
        if ((faceDetail.getLandmarks() == null) ^ (getLandmarks() == null)) {
            return false;
        }
        if (faceDetail.getLandmarks() != null && !faceDetail.getLandmarks().equals(getLandmarks())) {
            return false;
        }
        if ((faceDetail.getPose() == null) ^ (getPose() == null)) {
            return false;
        }
        if (faceDetail.getPose() != null && !faceDetail.getPose().equals(getPose())) {
            return false;
        }
        if ((faceDetail.getQuality() == null) ^ (getQuality() == null)) {
            return false;
        }
        if (faceDetail.getQuality() != null && !faceDetail.getQuality().equals(getQuality())) {
            return false;
        }
        if ((faceDetail.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (faceDetail.getConfidence() != null && !faceDetail.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((faceDetail.getFaceOccluded() == null) ^ (getFaceOccluded() == null)) {
            return false;
        }
        if (faceDetail.getFaceOccluded() != null && !faceDetail.getFaceOccluded().equals(getFaceOccluded())) {
            return false;
        }
        if ((faceDetail.getEyeDirection() == null) ^ (getEyeDirection() == null)) {
            return false;
        }
        return faceDetail.getEyeDirection() == null || faceDetail.getEyeDirection().equals(getEyeDirection());
    }

    public AgeRange getAgeRange() {
        return this.ageRange;
    }

    public Beard getBeard() {
        return this.beard;
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public Float getConfidence() {
        return this.confidence;
    }

    public List<Emotion> getEmotions() {
        return this.emotions;
    }

    public EyeDirection getEyeDirection() {
        return this.eyeDirection;
    }

    public Eyeglasses getEyeglasses() {
        return this.eyeglasses;
    }

    public EyeOpen getEyesOpen() {
        return this.eyesOpen;
    }

    public FaceOccluded getFaceOccluded() {
        return this.faceOccluded;
    }

    public Gender getGender() {
        return this.gender;
    }

    public List<Landmark> getLandmarks() {
        return this.landmarks;
    }

    public MouthOpen getMouthOpen() {
        return this.mouthOpen;
    }

    public Mustache getMustache() {
        return this.mustache;
    }

    public Pose getPose() {
        return this.pose;
    }

    public ImageQuality getQuality() {
        return this.quality;
    }

    public Smile getSmile() {
        return this.smile;
    }

    public Sunglasses getSunglasses() {
        return this.sunglasses;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((getBoundingBox() == null ? 0 : getBoundingBox().hashCode()) + 31) * 31) + (getAgeRange() == null ? 0 : getAgeRange().hashCode())) * 31) + (getSmile() == null ? 0 : getSmile().hashCode())) * 31) + (getEyeglasses() == null ? 0 : getEyeglasses().hashCode())) * 31) + (getSunglasses() == null ? 0 : getSunglasses().hashCode())) * 31) + (getGender() == null ? 0 : getGender().hashCode())) * 31) + (getBeard() == null ? 0 : getBeard().hashCode())) * 31) + (getMustache() == null ? 0 : getMustache().hashCode())) * 31) + (getEyesOpen() == null ? 0 : getEyesOpen().hashCode())) * 31) + (getMouthOpen() == null ? 0 : getMouthOpen().hashCode())) * 31) + (getEmotions() == null ? 0 : getEmotions().hashCode())) * 31) + (getLandmarks() == null ? 0 : getLandmarks().hashCode())) * 31) + (getPose() == null ? 0 : getPose().hashCode())) * 31) + (getQuality() == null ? 0 : getQuality().hashCode())) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getFaceOccluded() == null ? 0 : getFaceOccluded().hashCode())) * 31) + (getEyeDirection() != null ? getEyeDirection().hashCode() : 0);
    }

    public void setAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
    }

    public void setBeard(Beard beard) {
        this.beard = beard;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setConfidence(Float f) {
        this.confidence = f;
    }

    public void setEmotions(Collection<Emotion> collection) {
        if (collection == null) {
            this.emotions = null;
        } else {
            this.emotions = new ArrayList(collection);
        }
    }

    public void setEyeDirection(EyeDirection eyeDirection) {
        this.eyeDirection = eyeDirection;
    }

    public void setEyeglasses(Eyeglasses eyeglasses) {
        this.eyeglasses = eyeglasses;
    }

    public void setEyesOpen(EyeOpen eyeOpen) {
        this.eyesOpen = eyeOpen;
    }

    public void setFaceOccluded(FaceOccluded faceOccluded) {
        this.faceOccluded = faceOccluded;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setLandmarks(Collection<Landmark> collection) {
        if (collection == null) {
            this.landmarks = null;
        } else {
            this.landmarks = new ArrayList(collection);
        }
    }

    public void setMouthOpen(MouthOpen mouthOpen) {
        this.mouthOpen = mouthOpen;
    }

    public void setMustache(Mustache mustache) {
        this.mustache = mustache;
    }

    public void setPose(Pose pose) {
        this.pose = pose;
    }

    public void setQuality(ImageQuality imageQuality) {
        this.quality = imageQuality;
    }

    public void setSmile(Smile smile) {
        this.smile = smile;
    }

    public void setSunglasses(Sunglasses sunglasses) {
        this.sunglasses = sunglasses;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getAgeRange() != null) {
            sb.append("AgeRange: " + getAgeRange() + ",");
        }
        if (getSmile() != null) {
            sb.append("Smile: " + getSmile() + ",");
        }
        if (getEyeglasses() != null) {
            sb.append("Eyeglasses: " + getEyeglasses() + ",");
        }
        if (getSunglasses() != null) {
            sb.append("Sunglasses: " + getSunglasses() + ",");
        }
        if (getGender() != null) {
            sb.append("Gender: " + getGender() + ",");
        }
        if (getBeard() != null) {
            sb.append("Beard: " + getBeard() + ",");
        }
        if (getMustache() != null) {
            sb.append("Mustache: " + getMustache() + ",");
        }
        if (getEyesOpen() != null) {
            sb.append("EyesOpen: " + getEyesOpen() + ",");
        }
        if (getMouthOpen() != null) {
            sb.append("MouthOpen: " + getMouthOpen() + ",");
        }
        if (getEmotions() != null) {
            sb.append("Emotions: " + getEmotions() + ",");
        }
        if (getLandmarks() != null) {
            sb.append("Landmarks: " + getLandmarks() + ",");
        }
        if (getPose() != null) {
            sb.append("Pose: " + getPose() + ",");
        }
        if (getQuality() != null) {
            sb.append("Quality: " + getQuality() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
        }
        if (getFaceOccluded() != null) {
            sb.append("FaceOccluded: " + getFaceOccluded() + ",");
        }
        if (getEyeDirection() != null) {
            sb.append("EyeDirection: " + getEyeDirection());
        }
        sb.append("}");
        return sb.toString();
    }

    public FaceDetail withAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
        return this;
    }

    public FaceDetail withBeard(Beard beard) {
        this.beard = beard;
        return this;
    }

    public FaceDetail withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public FaceDetail withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public FaceDetail withEmotions(Emotion... emotionArr) {
        if (getEmotions() == null) {
            this.emotions = new ArrayList(emotionArr.length);
        }
        for (Emotion emotion : emotionArr) {
            this.emotions.add(emotion);
        }
        return this;
    }

    public FaceDetail withEyeDirection(EyeDirection eyeDirection) {
        this.eyeDirection = eyeDirection;
        return this;
    }

    public FaceDetail withEyeglasses(Eyeglasses eyeglasses) {
        this.eyeglasses = eyeglasses;
        return this;
    }

    public FaceDetail withEyesOpen(EyeOpen eyeOpen) {
        this.eyesOpen = eyeOpen;
        return this;
    }

    public FaceDetail withFaceOccluded(FaceOccluded faceOccluded) {
        this.faceOccluded = faceOccluded;
        return this;
    }

    public FaceDetail withGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public FaceDetail withLandmarks(Landmark... landmarkArr) {
        if (getLandmarks() == null) {
            this.landmarks = new ArrayList(landmarkArr.length);
        }
        for (Landmark landmark : landmarkArr) {
            this.landmarks.add(landmark);
        }
        return this;
    }

    public FaceDetail withMouthOpen(MouthOpen mouthOpen) {
        this.mouthOpen = mouthOpen;
        return this;
    }

    public FaceDetail withMustache(Mustache mustache) {
        this.mustache = mustache;
        return this;
    }

    public FaceDetail withPose(Pose pose) {
        this.pose = pose;
        return this;
    }

    public FaceDetail withQuality(ImageQuality imageQuality) {
        this.quality = imageQuality;
        return this;
    }

    public FaceDetail withSmile(Smile smile) {
        this.smile = smile;
        return this;
    }

    public FaceDetail withSunglasses(Sunglasses sunglasses) {
        this.sunglasses = sunglasses;
        return this;
    }

    public FaceDetail withEmotions(Collection<Emotion> collection) {
        setEmotions(collection);
        return this;
    }

    public FaceDetail withLandmarks(Collection<Landmark> collection) {
        setLandmarks(collection);
        return this;
    }
}
