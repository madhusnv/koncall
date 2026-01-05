package com.amazonaws.services.rekognition;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.regions.Region;
import com.amazonaws.services.rekognition.model.AssociateFacesRequest;
import com.amazonaws.services.rekognition.model.AssociateFacesResult;
import com.amazonaws.services.rekognition.model.CompareFacesRequest;
import com.amazonaws.services.rekognition.model.CompareFacesResult;
import com.amazonaws.services.rekognition.model.CopyProjectVersionRequest;
import com.amazonaws.services.rekognition.model.CopyProjectVersionResult;
import com.amazonaws.services.rekognition.model.CreateCollectionRequest;
import com.amazonaws.services.rekognition.model.CreateCollectionResult;
import com.amazonaws.services.rekognition.model.CreateDatasetRequest;
import com.amazonaws.services.rekognition.model.CreateDatasetResult;
import com.amazonaws.services.rekognition.model.CreateFaceLivenessSessionRequest;
import com.amazonaws.services.rekognition.model.CreateFaceLivenessSessionResult;
import com.amazonaws.services.rekognition.model.CreateProjectRequest;
import com.amazonaws.services.rekognition.model.CreateProjectResult;
import com.amazonaws.services.rekognition.model.CreateProjectVersionRequest;
import com.amazonaws.services.rekognition.model.CreateProjectVersionResult;
import com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest;
import com.amazonaws.services.rekognition.model.CreateStreamProcessorResult;
import com.amazonaws.services.rekognition.model.CreateUserRequest;
import com.amazonaws.services.rekognition.model.CreateUserResult;
import com.amazonaws.services.rekognition.model.DeleteCollectionRequest;
import com.amazonaws.services.rekognition.model.DeleteCollectionResult;
import com.amazonaws.services.rekognition.model.DeleteDatasetRequest;
import com.amazonaws.services.rekognition.model.DeleteDatasetResult;
import com.amazonaws.services.rekognition.model.DeleteFacesRequest;
import com.amazonaws.services.rekognition.model.DeleteFacesResult;
import com.amazonaws.services.rekognition.model.DeleteProjectPolicyRequest;
import com.amazonaws.services.rekognition.model.DeleteProjectPolicyResult;
import com.amazonaws.services.rekognition.model.DeleteProjectRequest;
import com.amazonaws.services.rekognition.model.DeleteProjectResult;
import com.amazonaws.services.rekognition.model.DeleteProjectVersionRequest;
import com.amazonaws.services.rekognition.model.DeleteProjectVersionResult;
import com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest;
import com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult;
import com.amazonaws.services.rekognition.model.DeleteUserRequest;
import com.amazonaws.services.rekognition.model.DeleteUserResult;
import com.amazonaws.services.rekognition.model.DescribeCollectionRequest;
import com.amazonaws.services.rekognition.model.DescribeCollectionResult;
import com.amazonaws.services.rekognition.model.DescribeDatasetRequest;
import com.amazonaws.services.rekognition.model.DescribeDatasetResult;
import com.amazonaws.services.rekognition.model.DescribeProjectVersionsRequest;
import com.amazonaws.services.rekognition.model.DescribeProjectVersionsResult;
import com.amazonaws.services.rekognition.model.DescribeProjectsRequest;
import com.amazonaws.services.rekognition.model.DescribeProjectsResult;
import com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest;
import com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult;
import com.amazonaws.services.rekognition.model.DetectCustomLabelsRequest;
import com.amazonaws.services.rekognition.model.DetectCustomLabelsResult;
import com.amazonaws.services.rekognition.model.DetectFacesRequest;
import com.amazonaws.services.rekognition.model.DetectFacesResult;
import com.amazonaws.services.rekognition.model.DetectLabelsRequest;
import com.amazonaws.services.rekognition.model.DetectLabelsResult;
import com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest;
import com.amazonaws.services.rekognition.model.DetectModerationLabelsResult;
import com.amazonaws.services.rekognition.model.DetectProtectiveEquipmentRequest;
import com.amazonaws.services.rekognition.model.DetectProtectiveEquipmentResult;
import com.amazonaws.services.rekognition.model.DetectTextRequest;
import com.amazonaws.services.rekognition.model.DetectTextResult;
import com.amazonaws.services.rekognition.model.DisassociateFacesRequest;
import com.amazonaws.services.rekognition.model.DisassociateFacesResult;
import com.amazonaws.services.rekognition.model.DistributeDatasetEntriesRequest;
import com.amazonaws.services.rekognition.model.DistributeDatasetEntriesResult;
import com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest;
import com.amazonaws.services.rekognition.model.GetCelebrityInfoResult;
import com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest;
import com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult;
import com.amazonaws.services.rekognition.model.GetContentModerationRequest;
import com.amazonaws.services.rekognition.model.GetContentModerationResult;
import com.amazonaws.services.rekognition.model.GetFaceDetectionRequest;
import com.amazonaws.services.rekognition.model.GetFaceDetectionResult;
import com.amazonaws.services.rekognition.model.GetFaceLivenessSessionResultsRequest;
import com.amazonaws.services.rekognition.model.GetFaceLivenessSessionResultsResult;
import com.amazonaws.services.rekognition.model.GetFaceSearchRequest;
import com.amazonaws.services.rekognition.model.GetFaceSearchResult;
import com.amazonaws.services.rekognition.model.GetLabelDetectionRequest;
import com.amazonaws.services.rekognition.model.GetLabelDetectionResult;
import com.amazonaws.services.rekognition.model.GetPersonTrackingRequest;
import com.amazonaws.services.rekognition.model.GetPersonTrackingResult;
import com.amazonaws.services.rekognition.model.GetSegmentDetectionRequest;
import com.amazonaws.services.rekognition.model.GetSegmentDetectionResult;
import com.amazonaws.services.rekognition.model.GetTextDetectionRequest;
import com.amazonaws.services.rekognition.model.GetTextDetectionResult;
import com.amazonaws.services.rekognition.model.IndexFacesRequest;
import com.amazonaws.services.rekognition.model.IndexFacesResult;
import com.amazonaws.services.rekognition.model.ListCollectionsRequest;
import com.amazonaws.services.rekognition.model.ListCollectionsResult;
import com.amazonaws.services.rekognition.model.ListDatasetEntriesRequest;
import com.amazonaws.services.rekognition.model.ListDatasetEntriesResult;
import com.amazonaws.services.rekognition.model.ListDatasetLabelsRequest;
import com.amazonaws.services.rekognition.model.ListDatasetLabelsResult;
import com.amazonaws.services.rekognition.model.ListFacesRequest;
import com.amazonaws.services.rekognition.model.ListFacesResult;
import com.amazonaws.services.rekognition.model.ListProjectPoliciesRequest;
import com.amazonaws.services.rekognition.model.ListProjectPoliciesResult;
import com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest;
import com.amazonaws.services.rekognition.model.ListStreamProcessorsResult;
import com.amazonaws.services.rekognition.model.ListTagsForResourceRequest;
import com.amazonaws.services.rekognition.model.ListTagsForResourceResult;
import com.amazonaws.services.rekognition.model.ListUsersRequest;
import com.amazonaws.services.rekognition.model.ListUsersResult;
import com.amazonaws.services.rekognition.model.PutProjectPolicyRequest;
import com.amazonaws.services.rekognition.model.PutProjectPolicyResult;
import com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest;
import com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult;
import com.amazonaws.services.rekognition.model.SearchFacesByImageRequest;
import com.amazonaws.services.rekognition.model.SearchFacesByImageResult;
import com.amazonaws.services.rekognition.model.SearchFacesRequest;
import com.amazonaws.services.rekognition.model.SearchFacesResult;
import com.amazonaws.services.rekognition.model.SearchUsersByImageRequest;
import com.amazonaws.services.rekognition.model.SearchUsersByImageResult;
import com.amazonaws.services.rekognition.model.SearchUsersRequest;
import com.amazonaws.services.rekognition.model.SearchUsersResult;
import com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest;
import com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult;
import com.amazonaws.services.rekognition.model.StartContentModerationRequest;
import com.amazonaws.services.rekognition.model.StartContentModerationResult;
import com.amazonaws.services.rekognition.model.StartFaceDetectionRequest;
import com.amazonaws.services.rekognition.model.StartFaceDetectionResult;
import com.amazonaws.services.rekognition.model.StartFaceSearchRequest;
import com.amazonaws.services.rekognition.model.StartFaceSearchResult;
import com.amazonaws.services.rekognition.model.StartLabelDetectionRequest;
import com.amazonaws.services.rekognition.model.StartLabelDetectionResult;
import com.amazonaws.services.rekognition.model.StartPersonTrackingRequest;
import com.amazonaws.services.rekognition.model.StartPersonTrackingResult;
import com.amazonaws.services.rekognition.model.StartProjectVersionRequest;
import com.amazonaws.services.rekognition.model.StartProjectVersionResult;
import com.amazonaws.services.rekognition.model.StartSegmentDetectionRequest;
import com.amazonaws.services.rekognition.model.StartSegmentDetectionResult;
import com.amazonaws.services.rekognition.model.StartStreamProcessorRequest;
import com.amazonaws.services.rekognition.model.StartStreamProcessorResult;
import com.amazonaws.services.rekognition.model.StartTextDetectionRequest;
import com.amazonaws.services.rekognition.model.StartTextDetectionResult;
import com.amazonaws.services.rekognition.model.StopProjectVersionRequest;
import com.amazonaws.services.rekognition.model.StopProjectVersionResult;
import com.amazonaws.services.rekognition.model.StopStreamProcessorRequest;
import com.amazonaws.services.rekognition.model.StopStreamProcessorResult;
import com.amazonaws.services.rekognition.model.TagResourceRequest;
import com.amazonaws.services.rekognition.model.TagResourceResult;
import com.amazonaws.services.rekognition.model.UntagResourceRequest;
import com.amazonaws.services.rekognition.model.UntagResourceResult;
import com.amazonaws.services.rekognition.model.UpdateDatasetEntriesRequest;
import com.amazonaws.services.rekognition.model.UpdateDatasetEntriesResult;
import com.amazonaws.services.rekognition.model.UpdateStreamProcessorRequest;
import com.amazonaws.services.rekognition.model.UpdateStreamProcessorResult;

/* loaded from: classes5.dex */
public interface AmazonRekognition {
    AssociateFacesResult associateFaces(AssociateFacesRequest associateFacesRequest);

    CompareFacesResult compareFaces(CompareFacesRequest compareFacesRequest);

    CopyProjectVersionResult copyProjectVersion(CopyProjectVersionRequest copyProjectVersionRequest);

    CreateCollectionResult createCollection(CreateCollectionRequest createCollectionRequest);

    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

    CreateFaceLivenessSessionResult createFaceLivenessSession(CreateFaceLivenessSessionRequest createFaceLivenessSessionRequest);

    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

    CreateProjectVersionResult createProjectVersion(CreateProjectVersionRequest createProjectVersionRequest);

    CreateStreamProcessorResult createStreamProcessor(CreateStreamProcessorRequest createStreamProcessorRequest);

    CreateUserResult createUser(CreateUserRequest createUserRequest);

    DeleteCollectionResult deleteCollection(DeleteCollectionRequest deleteCollectionRequest);

    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    DeleteFacesResult deleteFaces(DeleteFacesRequest deleteFacesRequest);

    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    DeleteProjectPolicyResult deleteProjectPolicy(DeleteProjectPolicyRequest deleteProjectPolicyRequest);

    DeleteProjectVersionResult deleteProjectVersion(DeleteProjectVersionRequest deleteProjectVersionRequest);

    DeleteStreamProcessorResult deleteStreamProcessor(DeleteStreamProcessorRequest deleteStreamProcessorRequest);

    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    DescribeCollectionResult describeCollection(DescribeCollectionRequest describeCollectionRequest);

    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    DescribeProjectVersionsResult describeProjectVersions(DescribeProjectVersionsRequest describeProjectVersionsRequest);

    DescribeProjectsResult describeProjects(DescribeProjectsRequest describeProjectsRequest);

    DescribeStreamProcessorResult describeStreamProcessor(DescribeStreamProcessorRequest describeStreamProcessorRequest);

    DetectCustomLabelsResult detectCustomLabels(DetectCustomLabelsRequest detectCustomLabelsRequest);

    DetectFacesResult detectFaces(DetectFacesRequest detectFacesRequest);

    DetectLabelsResult detectLabels(DetectLabelsRequest detectLabelsRequest);

    DetectModerationLabelsResult detectModerationLabels(DetectModerationLabelsRequest detectModerationLabelsRequest);

    DetectProtectiveEquipmentResult detectProtectiveEquipment(DetectProtectiveEquipmentRequest detectProtectiveEquipmentRequest);

    DetectTextResult detectText(DetectTextRequest detectTextRequest);

    DisassociateFacesResult disassociateFaces(DisassociateFacesRequest disassociateFacesRequest);

    DistributeDatasetEntriesResult distributeDatasetEntries(DistributeDatasetEntriesRequest distributeDatasetEntriesRequest);

    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest);

    GetCelebrityInfoResult getCelebrityInfo(GetCelebrityInfoRequest getCelebrityInfoRequest);

    GetCelebrityRecognitionResult getCelebrityRecognition(GetCelebrityRecognitionRequest getCelebrityRecognitionRequest);

    GetContentModerationResult getContentModeration(GetContentModerationRequest getContentModerationRequest);

    GetFaceDetectionResult getFaceDetection(GetFaceDetectionRequest getFaceDetectionRequest);

    GetFaceLivenessSessionResultsResult getFaceLivenessSessionResults(GetFaceLivenessSessionResultsRequest getFaceLivenessSessionResultsRequest);

    GetFaceSearchResult getFaceSearch(GetFaceSearchRequest getFaceSearchRequest);

    GetLabelDetectionResult getLabelDetection(GetLabelDetectionRequest getLabelDetectionRequest);

    GetPersonTrackingResult getPersonTracking(GetPersonTrackingRequest getPersonTrackingRequest);

    GetSegmentDetectionResult getSegmentDetection(GetSegmentDetectionRequest getSegmentDetectionRequest);

    GetTextDetectionResult getTextDetection(GetTextDetectionRequest getTextDetectionRequest);

    IndexFacesResult indexFaces(IndexFacesRequest indexFacesRequest);

    ListCollectionsResult listCollections(ListCollectionsRequest listCollectionsRequest);

    ListDatasetEntriesResult listDatasetEntries(ListDatasetEntriesRequest listDatasetEntriesRequest);

    ListDatasetLabelsResult listDatasetLabels(ListDatasetLabelsRequest listDatasetLabelsRequest);

    ListFacesResult listFaces(ListFacesRequest listFacesRequest);

    ListProjectPoliciesResult listProjectPolicies(ListProjectPoliciesRequest listProjectPoliciesRequest);

    ListStreamProcessorsResult listStreamProcessors(ListStreamProcessorsRequest listStreamProcessorsRequest);

    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    PutProjectPolicyResult putProjectPolicy(PutProjectPolicyRequest putProjectPolicyRequest);

    RecognizeCelebritiesResult recognizeCelebrities(RecognizeCelebritiesRequest recognizeCelebritiesRequest);

    SearchFacesResult searchFaces(SearchFacesRequest searchFacesRequest);

    SearchFacesByImageResult searchFacesByImage(SearchFacesByImageRequest searchFacesByImageRequest);

    SearchUsersResult searchUsers(SearchUsersRequest searchUsersRequest);

    SearchUsersByImageResult searchUsersByImage(SearchUsersByImageRequest searchUsersByImageRequest);

    void setEndpoint(String str);

    void setRegion(Region region);

    void shutdown();

    StartCelebrityRecognitionResult startCelebrityRecognition(StartCelebrityRecognitionRequest startCelebrityRecognitionRequest);

    StartContentModerationResult startContentModeration(StartContentModerationRequest startContentModerationRequest);

    StartFaceDetectionResult startFaceDetection(StartFaceDetectionRequest startFaceDetectionRequest);

    StartFaceSearchResult startFaceSearch(StartFaceSearchRequest startFaceSearchRequest);

    StartLabelDetectionResult startLabelDetection(StartLabelDetectionRequest startLabelDetectionRequest);

    StartPersonTrackingResult startPersonTracking(StartPersonTrackingRequest startPersonTrackingRequest);

    StartProjectVersionResult startProjectVersion(StartProjectVersionRequest startProjectVersionRequest);

    StartSegmentDetectionResult startSegmentDetection(StartSegmentDetectionRequest startSegmentDetectionRequest);

    StartStreamProcessorResult startStreamProcessor(StartStreamProcessorRequest startStreamProcessorRequest);

    StartTextDetectionResult startTextDetection(StartTextDetectionRequest startTextDetectionRequest);

    StopProjectVersionResult stopProjectVersion(StopProjectVersionRequest stopProjectVersionRequest);

    StopStreamProcessorResult stopStreamProcessor(StopStreamProcessorRequest stopStreamProcessorRequest);

    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    UpdateDatasetEntriesResult updateDatasetEntries(UpdateDatasetEntriesRequest updateDatasetEntriesRequest);

    UpdateStreamProcessorResult updateStreamProcessor(UpdateStreamProcessorRequest updateStreamProcessorRequest);
}
