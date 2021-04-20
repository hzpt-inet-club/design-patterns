package com.hcy.model.vo;

/**
 * 决策结果
 * @author HCY
 * @since 2021/3/26 上午9:13
*/
public class EngineResult {
    /**
     * 执行结果
     */
    private boolean isSuccess;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 果实节点ID
     */
    private Long nodeId;
    /**
     * 果实节点值
     */
    private String nodeValue;

    public EngineResult() {
    }

    public EngineResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }
}
