<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for objectsObjectworkflowsTasksGET
 */
class ObjectsObjectworkflowsTasksGETParameterData
{
    /**
     * @DTA\Data(subset="header", field="Authorization", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $authorization = null;

    /**
     * To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used.
     * @DTA\Data(subset="query", field="object__v", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $object__v = null;

    /**
     * When localized (translated) strings are available, retrieve them by including ?loc&#x3D;true.
     * @DTA\Data(subset="query", field="loc", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $loc = null;

    /**
     * To retrieve all workflow tasks available to a particular user, include the user id field value as ?assignee__v&#x3D;{id}. To retrieve your own workflow tasks, set this value to ?assignee__v&#x3D;me. This parameter is required when the object__v and record_id__v parameters are not used.
     * @DTA\Data(subset="query", field="assignee__v", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $assignee__v = null;

    /**
     * This parameter is used to paginate the results. It specifies the amount of offset from the first record returned. Vault returns 200 records per page by default. If you are viewing the first 200 results (page 1) and want to see the next page, set this to ?offset&#x3D;201.
     * @DTA\Data(subset="query", field="offset", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $offset = null;

    /**
     * @DTA\Data(subset="header", field="Accept", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $accept = null;

    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * @DTA\Data(subset="header", field="X-VaultAPI-ClientID", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $x_vault_api_client_id = null;

    /**
     * To retrieve all workflow tasks configured on an object, include the Vault object name__v and object record id field values as ?object__v&#x3D;{name__v}&amp;record_id__v&#x3D;{id}. These two parameters are required when the assignee__v parameter is not used.
     * @DTA\Data(subset="query", field="record_id__v", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $record_id__v = null;

    /**
     * To retrieve all workflow tasks with specific statuses, include one or more status name__v field values. For example: ?status__v&#x3D;available__v or ?status__v&#x3D;available__v,completed__v.
     * @DTA\Data(subset="query", field="status__v", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $status__v = null;

    /**
     * This parameter is used to paginate the results. It specifies the size number of records to display per page. Vault returns 200 records per page by default. You can set this value lower or as high as 1000 records per page. For example: ?page_size&#x3D;1000.
     * @DTA\Data(subset="query", field="page_size", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $page_size = null;

}
