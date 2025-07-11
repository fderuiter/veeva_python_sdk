<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for objectsDocumentsAnnotationsBatchPOST
 */
class ObjectsDocumentsAnnotationsBatchPOSTParameterData
{
    /**
     * @DTA\Data(subset="header", field="Authorization")
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="Length", options={"min":0, "max":0})
     */
    public ?string $authorization = null;

    /**
     * @DTA\Data(subset="header", field="Accept")
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="Length", options={"min":0, "max":0})
     */
    public ?string $accept = null;

    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * @DTA\Data(subset="header", field="X-VaultAPI-ClientID")
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="Length", options={"min":0, "max":0})
     */
    public ?string $x_vault_api_client_id = null;

    /**
     * @DTA\Data(subset="header", field="Content-Type")
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="Length", options={"min":0, "max":0})
     */
    public ?string $content_type = null;

}
