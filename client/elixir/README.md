# VeevaVaultAPIV251

The latest GA version of the Vault REST API.

## Building

To install the required dependencies and to build the elixir project, run:

```console
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex][], the package can be installed by adding `veeva_vault_apiv251` to
your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:veeva_vault_apiv251, "~> 1.0.0"}]
end
```

Documentation can be generated with [ExDoc][] and published on [HexDocs][]. Once published, the docs can be found at
[https://hexdocs.pm/veeva_vault_apiv251][docs].

## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your
configuration files).

```elixir
config :veeva_vault_apiv251, base_url: "http://}/api/v25.1"
```

Multiple clients for the same API with different URLs can be created passing different `base_url`s when calling
`VeevaVaultAPIV251.Connection.new/1`:

```elixir
client = VeevaVaultAPIV251.Connection.new(base_url: "http://}/api/v25.1")
```

[exdoc]: https://github.com/elixir-lang/ex_doc
[hexdocs]: https://hexdocs.pm
[available in hex]: https://hex.pm/docs/publish
[docs]: https://hexdocs.pm/veeva_vault_apiv251
