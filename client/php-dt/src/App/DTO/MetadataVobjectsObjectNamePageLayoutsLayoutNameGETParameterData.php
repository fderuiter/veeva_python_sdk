<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for metadataVobjectsObjectNamePageLayoutsLayoutNameGET
 */
class MetadataVobjectsObjectNamePageLayoutsLayoutNameGETParameterData
{
    /**
     * @DTA\Data(subset="header", field="Authorization", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $authorization = null;

    /**
     * The name of the page layout from which to retrieve metadata.
     * @DTA\Data(subset="path", field="layout_name")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $layout_name = null;

    /**
     * @DTA\Data(subset="header", field="Accept", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $accept = null;

    /**
     * The name of the object from which to retrieve page layout metadata.
     * @DTA\Data(subset="path", field="object_name")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $object_name = null;

    /**
     * Include a Client ID to identify this request. This ID appears in the API Usage Logs, which is avaiable to download from Admin &gt; Logs &gt; API Usage Logs or through the Vault REST API with the Download Daily API Usage request. If omitted, the value will appear as &#x60;unknown&#x60; in the API Usage Log.
     * @DTA\Data(subset="header", field="X-VaultAPI-ClientID", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $x_vault_api_client_id = null;

}
