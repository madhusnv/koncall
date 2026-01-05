package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ComparedFace implements Serializable {
    private BoundingBox boundingBox;
    private Float confidence;
    private List<Emotion> emotions;
    private List<Landmark> landmarks;
    private Pose pose;
    private ImageQuality quality;
    private Smile smile;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ComparedFace)) {
            return false;
        }
        ComparedFace comparedFace = (ComparedFace) obj;
        if ((comparedFace.getBoundingBox() == null) ^ (getBoundingBox() == null)) {
            return false;
        }
        if (comparedFace.getBoundingBox() != null && !comparedFace.getBoundingBox().equals(getBoundingBox())) {
            return false;
        }
        if ((comparedFace.getConfidence() == null) ^ (getConfidence() == null)) {
            return false;
        }
        if (comparedFace.getConfidence() != null && !comparedFace.getConfidence().equals(getConfidence())) {
            return false;
        }
        if ((comparedFace.getLandmarks() == null) ^ (getLandmarks() == null)) {
            return false;
        }
        if (comparedFace.getLandmarks() != null && !comparedFace.getLandmarks().equals(getLandmarks())) {
            return false;
        }
        if ((comparedFace.getPose() == null) ^ (getPose() == null)) {
            return false;
        }
        if (comparedFace.getPose() != null && !comparedFace.getPose().equals(getPose())) {
            return false;
        }
        if ((comparedFace.getQuality() == null) ^ (getQuality() == null)) {
            return false;
        }
        if (comparedFace.getQuality() != null && !comparedFace.getQuality().equals(getQuality())) {
            return false;
        }
        if ((comparedFace.getEmotions() == null) ^ (getEmotions() == null)) {
            return false;
        }
        if (comparedFace.getEmotions() != null && !comparedFace.getEmotions().equals(getEmotions())) {
            return false;
        }
        if ((comparedFace.getSmile() == null) ^ (getSmile() == null)) {
            return false;
        }
        return comparedFace.getSmile() == null || comparedFace.getSmile().equals(getSmile());
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

    public List<Landmark> getLandmarks() {
        return this.landmarks;
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

    public int hashCode() {
        return (((((((((((((getBoundingBox() == null ? 0 : getBoundingBox().hashCode()) + 31) * 31) + (getConfidence() == null ? 0 : getConfidence().hashCode())) * 31) + (getLandmarks() == null ? 0 : getLandmarks().hashCode())) * 31) + (getPose() == null ? 0 : getPose().hashCode())) * 31) + (getQuality() == null ? 0 : getQuality().hashCode())) * 31) + (getEmotions() == null ? 0 : getEmotions().hashCode())) * 31) + (getSmile() != null ? getSmile().hashCode() : 0);
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

    public void setLandmarks(Collection<Landmark> collection) {
        if (collection == null) {
            this.landmarks = null;
        } else {
            this.landmarks = new ArrayList(collection);
        }
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBoundingBox() != null) {
            sb.append("BoundingBox: " + getBoundingBox() + ",");
        }
        if (getConfidence() != null) {
            sb.append("Confidence: " + getConfidence() + ",");
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
        if (getEmotions() != null) {
            sb.append("Emotions: " + getEmotions() + ",");
        }
        if (getSmile() != null) {
            sb.append("Smile: " + getSmile());
        }
        sb.append("}");
        return sb.toString();
    }

    public ComparedFace withBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public ComparedFace withConfidence(Float f) {
        this.confidence = f;
        return this;
    }

    public ComparedFace withEmotions(Emotion... emotionArr) {
        if (getEmotions() == null) {
            this.emotions = new ArrayList(emotionArr.length);
        }
        for (Emotion emotion : emotionArr) {
            this.emotions.add(emotion);
        }
        return this;
    }

    public ComparedFace withLandmarks(Landmark... landmarkArr) {
        if (getLandmarks() == null) {
            this.landmarks = new ArrayList(landmarkArr.length);
        }
        for (Landmark landmark : landmarkArr) {
            this.landmarks.add(landmark);
        }
        return this;
    }

    public ComparedFace withPose(Pose pose) {
        this.pose = pose;
        return this;
    }

    public ComparedFace withQuality(ImageQuality imageQuality) {
        this.quality = imageQuality;
        return this;
    }

    public ComparedFace withSmile(Smile smile) {
        this.smile = smile;
        return this;
    }

    public ComparedFace withEmotions(Collection<Emotion> collection) {
        setEmotions(collection);
        return this;
    }

    public ComparedFace withLandmarks(Collection<Landmark> collection) {
        setLandmarks(collection);
        return this;
    }
}
