<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for vobjectsObjectNamePOST
 */
class VobjectsObjectNamePOSTParameterData
{
    /**
     * @DTA\Data(subset="header", field="Authorization", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $authorization = null;

    /**
     * If set to &#x60;true&#x60; and Record Migration Mode is enabled, it bypasses all standard and custom SDK triggers.
     * @DTA\Data(subset="header", field="X-VaultAPI-NoTriggers", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $x_vault_api_no_triggers = null;

    /**
     * Can be text/csv or application/json
     * @DTA\Data(subset="header", field="Accept", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $accept = null;

    /**
     * The object name__v field value (product__v, country__v, custom_object__c, etc.).
     * @DTA\Data(subset="path", field="object_name")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $object_name = null;

    /**
     * If set to &#x60;true&#x60;, Vault allows you to create or update object records in a noninitial state and with minimal validation, create inactive records, and set standard and system-managed fields such as &#x60;created_by__v&#x60;. Does not bypass record triggers. Use the &#x60;X-VaultAPI-NoTriggers&#x60; header to bypass all standard and custom SDK triggers. You must have the Record Migration permission to use this header.
     * @DTA\Data(subset="header", field="X-VaultAPI-MigrationMode", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $x_vault_api_migration_mode = null;

    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * @DTA\Data(subset="header", field="X-VaultAPI-ClientID", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $x_vault_api_client_id = null;

    /**
     * To upsert object records, add &#x60;idParam&#x3D;{field_name}&#x60; to the request endpoint. You can use any object field which has &#x60;unique&#x60; set to &#x60;true&#x60; in the object metadata. For example, &#x60;idParam&#x3D;external_id__v&#x60;.
     * @DTA\Data(subset="query", field="idParam", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $id_param = null;

    /**
     * Can be text/csv or application/json
     * @DTA\Data(subset="header", field="Content-Type", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $content_type = null;

}
