<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for objectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDELETE
 */
class ObjectsDocumentsDocIdRolesRoleNameAndUserOrGroupIdDELETEParameterData
{
    /**
     * @DTA\Data(subset="header", field="Authorization", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $authorization = null;

    /**
     * The name of the role from which to remove the user or group followed by either &#x60;user&#x60; or &#x60;group&#x60;. The format is &#x60;{role_name}.{user_or_group}&#x60;. For example, &#x60;consumer__v.user&#x60;.
     * @DTA\Data(subset="path", field="role_name_and_user_or_group")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $role_name_and_user_or_group = null;

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
     * The id value of the user or group to remove from the role.
     * @DTA\Data(subset="path", field="id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The id value of the document from which to remove roles.
     * @DTA\Data(subset="path", field="doc_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $doc_id = null;

}
