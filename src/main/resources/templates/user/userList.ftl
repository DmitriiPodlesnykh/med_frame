<div>
    <div>
        <table>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
        <#list users as user>
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getFirstName()}</td>
                <td>${user.getLastName()}</td>
            </tr>
        </#list>
        </table>
    </div>
</div>
