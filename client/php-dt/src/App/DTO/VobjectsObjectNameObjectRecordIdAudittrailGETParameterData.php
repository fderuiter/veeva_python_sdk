<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for vobjectsObjectNameObjectRecordIdAudittrailGET
 */
class VobjectsObjectNameObjectRecordIdAudittrailGETParameterData
{
    /**
     * Specify an end date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to today’s date.
     * @DTA\Data(subset="query", field="end_date", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $end_date = null;

    /**
     * @DTA\Data(subset="header", field="Authorization", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $authorization = null;

    /**
     * Paginate the results displayed per page by specifying the amount of offset from the entry returned. For example, if you are viewing the first 50 results (page 1) and want to see the next page, set this to offset&#x3D;51. If omitted, defaults to 0.
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
     * The object name__v field value.
     * @DTA\Data(subset="path", field="object_name")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $object_name = null;

    /**
     * Paginate the results by specifying the maximum number of histories per page in the response. This can be any value between 1 and 1000. If omitted, defaults to 200.
     * @DTA\Data(subset="query", field="limit", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $limit = null;

    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * @DTA\Data(subset="header", field="X-VaultAPI-ClientID", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $x_vault_api_client_id = null;

    /**
     * To request a CSV file of your audit history, use csv.
     * @DTA\Data(subset="query", field="format_result", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $format_result = null;

    /**
     * The object record id field value from which to retrieve user actions.
     * @DTA\Data(subset="path", field="object_record_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $object_record_id = null;

    /**
     * Provide a comma-separated list of one or more audit events to retrieve their audit history. See Vault Help for a full list of object audit events. The values passed to this parameter are case sensitive. For example, events&#x3D;Copy,Edit,Delete. If omitted, defaults to all audit events.
     * @DTA\Data(subset="query", field="events", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $events = null;

    /**
     * Specify a start date to retrieve audit history. This date cannot be more than 30 days ago. Dates must be YYYY-MM-DDTHH:MM:SSZ format, for example, 7AM on January 15, 2018 would use 2018-01-15T07:00:00Z. If omitted, defaults to the vVault’s creation date.
     * @DTA\Data(subset="query", field="start_date", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $start_date = null;

}
