package com.amazonaws.services.rekognition.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class UpdateStreamProcessorRequest extends AmazonWebServiceRequest implements Serializable {
    private StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate;
    private String name;
    private List<String> parametersToDelete;
    private List<RegionOfInterest> regionsOfInterestForUpdate;
    private StreamProcessorSettingsForUpdate settingsForUpdate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateStreamProcessorRequest)) {
            return false;
        }
        UpdateStreamProcessorRequest updateStreamProcessorRequest = (UpdateStreamProcessorRequest) obj;
        if ((updateStreamProcessorRequest.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (updateStreamProcessorRequest.getName() != null && !updateStreamProcessorRequest.getName().equals(getName())) {
            return false;
        }
        if ((updateStreamProcessorRequest.getSettingsForUpdate() == null) ^ (getSettingsForUpdate() == null)) {
            return false;
        }
        if (updateStreamProcessorRequest.getSettingsForUpdate() != null && !updateStreamProcessorRequest.getSettingsForUpdate().equals(getSettingsForUpdate())) {
            return false;
        }
        if ((updateStreamProcessorRequest.getRegionsOfInterestForUpdate() == null) ^ (getRegionsOfInterestForUpdate() == null)) {
            return false;
        }
        if (updateStreamProcessorRequest.getRegionsOfInterestForUpdate() != null && !updateStreamProcessorRequest.getRegionsOfInterestForUpdate().equals(getRegionsOfInterestForUpdate())) {
            return false;
        }
        if ((updateStreamProcessorRequest.getDataSharingPreferenceForUpdate() == null) ^ (getDataSharingPreferenceForUpdate() == null)) {
            return false;
        }
        if (updateStreamProcessorRequest.getDataSharingPreferenceForUpdate() != null && !updateStreamProcessorRequest.getDataSharingPreferenceForUpdate().equals(getDataSharingPreferenceForUpdate())) {
            return false;
        }
        if ((updateStreamProcessorRequest.getParametersToDelete() == null) ^ (getParametersToDelete() == null)) {
            return false;
        }
        return updateStreamProcessorRequest.getParametersToDelete() == null || updateStreamProcessorRequest.getParametersToDelete().equals(getParametersToDelete());
    }

    public StreamProcessorDataSharingPreference getDataSharingPreferenceForUpdate() {
        return this.dataSharingPreferenceForUpdate;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getParametersToDelete() {
        return this.parametersToDelete;
    }

    public List<RegionOfInterest> getRegionsOfInterestForUpdate() {
        return this.regionsOfInterestForUpdate;
    }

    public StreamProcessorSettingsForUpdate getSettingsForUpdate() {
        return this.settingsForUpdate;
    }

    public int hashCode() {
        return (((((((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getSettingsForUpdate() == null ? 0 : getSettingsForUpdate().hashCode())) * 31) + (getRegionsOfInterestForUpdate() == null ? 0 : getRegionsOfInterestForUpdate().hashCode())) * 31) + (getDataSharingPreferenceForUpdate() == null ? 0 : getDataSharingPreferenceForUpdate().hashCode())) * 31) + (getParametersToDelete() != null ? getParametersToDelete().hashCode() : 0);
    }

    public void setDataSharingPreferenceForUpdate(StreamProcessorDataSharingPreference streamProcessorDataSharingPreference) {
        this.dataSharingPreferenceForUpdate = streamProcessorDataSharingPreference;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParametersToDelete(Collection<String> collection) {
        if (collection == null) {
            this.parametersToDelete = null;
        } else {
            this.parametersToDelete = new ArrayList(collection);
        }
    }

    public void setRegionsOfInterestForUpdate(Collection<RegionOfInterest> collection) {
        if (collection == null) {
            this.regionsOfInterestForUpdate = null;
        } else {
            this.regionsOfInterestForUpdate = new ArrayList(collection);
        }
    }

    public void setSettingsForUpdate(StreamProcessorSettingsForUpdate streamProcessorSettingsForUpdate) {
        this.settingsForUpdate = streamProcessorSettingsForUpdate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) {
            sb.append("Name: " + getName() + ",");
        }
        if (getSettingsForUpdate() != null) {
            sb.append("SettingsForUpdate: " + getSettingsForUpdate() + ",");
        }
        if (getRegionsOfInterestForUpdate() != null) {
            sb.append("RegionsOfInterestForUpdate: " + getRegionsOfInterestForUpdate() + ",");
        }
        if (getDataSharingPreferenceForUpdate() != null) {
            sb.append("DataSharingPreferenceForUpdate: " + getDataSharingPreferenceForUpdate() + ",");
        }
        if (getParametersToDelete() != null) {
            sb.append("ParametersToDelete: " + getParametersToDelete());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateStreamProcessorRequest withDataSharingPreferenceForUpdate(StreamProcessorDataSharingPreference streamProcessorDataSharingPreference) {
        this.dataSharingPreferenceForUpdate = streamProcessorDataSharingPreference;
        return this;
    }

    public UpdateStreamProcessorRequest withName(String str) {
        this.name = str;
        return this;
    }

    public UpdateStreamProcessorRequest withParametersToDelete(String... strArr) {
        if (getParametersToDelete() == null) {
            this.parametersToDelete = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.parametersToDelete.add(str);
        }
        return this;
    }

    public UpdateStreamProcessorRequest withRegionsOfInterestForUpdate(RegionOfInterest... regionOfInterestArr) {
        if (getRegionsOfInterestForUpdate() == null) {
            this.regionsOfInterestForUpdate = new ArrayList(regionOfInterestArr.length);
        }
        for (RegionOfInterest regionOfInterest : regionOfInterestArr) {
            this.regionsOfInterestForUpdate.add(regionOfInterest);
        }
        return this;
    }

    public UpdateStreamProcessorRequest withSettingsForUpdate(StreamProcessorSettingsForUpdate streamProcessorSettingsForUpdate) {
        this.settingsForUpdate = streamProcessorSettingsForUpdate;
        return this;
    }

    public UpdateStreamProcessorRequest withParametersToDelete(Collection<String> collection) {
        setParametersToDelete(collection);
        return this;
    }

    public UpdateStreamProcessorRequest withRegionsOfInterestForUpdate(Collection<RegionOfInterest> collection) {
        setRegionsOfInterestForUpdate(collection);
        return this;
    }
}
